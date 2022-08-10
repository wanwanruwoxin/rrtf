<template>
  <div class="doc1180 paddingT20 fn-clear">
    <div class="myPost_Theme"  style="height: 80vh;">
      <el-table :data="data" stripe style="width: 100%">
        <el-table-column prop="linkName" label="连接名称" width="180" />
        <el-table-column prop="linkUrl" label="连接地址" width="180" />
        <el-table-column prop="linkDesc" label="连接描述" />
        <el-table-column prop="relateUnit" label="相关单位" width="180" />
        <el-table-column prop="lastModify" label="创建日期" width="180" />
        <el-table-column fixed="right" label="操作" width="120">
          <template v-slot="scope">
            <el-button link type="primary" size="small" @click="edit(scope.row)">编辑</el-button>
            <el-button link type="primary" size="small" @click="deleteData(scope.row.linkId)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <div class="" style="margin-top: 40px;">
        <el-button type="success" @click="dialogFormVisible = true">创建</el-button>
      </div>
    </div>
  </div>
<!--  编辑对话框 -->
  <el-dialog v-model="editDialogVisible" title="连接信息">
    <el-form :model="editData">
      <el-form-item label="连接名称" :label-width="formLabelWidth">
        <el-input v-model="editData.linkName" autocomplete="off" />
      </el-form-item>
      <el-form-item label="连接地址" :label-width="formLabelWidth">
        <el-input v-model="editData.linkUrl" autocomplete="off" />
      </el-form-item>
      <el-form-item label="相关单位" :label-width="formLabelWidth">
        <el-input v-model="editData.relateUnit" autocomplete="off" />
      </el-form-item>
      <el-form-item label="描述" :label-width="formLabelWidth">
        <el-input
          v-model="editData.linkDesc"
          :rows="2"
          type="textarea"
          placeholder="Please input"
        />
      </el-form-item>
    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="editDialogVisible = false">Cancel</el-button>
        <el-button type="primary" @click="update">Confirm</el-button>
      </span>
    </template>
  </el-dialog>
<!--  新建对话框 -->
  <el-dialog v-model="dialogFormVisible" title="连接信息">
    <el-form :model="form">
      <el-form-item label="连接名称" :label-width="formLabelWidth">
        <el-input v-model="form.linkName" autocomplete="off" />
      </el-form-item>
      <el-form-item label="连接地址" :label-width="formLabelWidth">
        <el-input v-model="form.linkUrl" autocomplete="off" />
      </el-form-item>
      <el-form-item label="相关单位" :label-width="formLabelWidth">
        <el-input v-model="form.relateUnit" autocomplete="off" />
      </el-form-item>
      <el-form-item label="描述" :label-width="formLabelWidth">
        <el-input
          v-model="form.linkDesc"
          :rows="2"
          type="textarea"
          placeholder="Please input"
        />
      </el-form-item>
    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogFormVisible = false">Cancel</el-button>
        <el-button type="primary" @click="submitData"
        >Confirm</el-button
        >
      </span>
    </template>
  </el-dialog>
</template>

<script>
import { onMounted, reactive, ref } from 'vue'
import axios from 'axios'

export default {
  name: 'link-page',
  setup () {
    const dialogFormVisible = ref(false)
    const editDialogVisible = ref(false)
    const formLabelWidth = '140px'
    const data = ref([])
    const form = reactive({
      linkId: '',
      linkName: '',
      linkUrl: '',
      relateUnit: '',
      linkDesc: '',
      lastModify: ''
    })
    const editData = reactive({
      linkId: '',
      linkName: '',
      linkUrl: '',
      relateUnit: '',
      linkDesc: '',
      lastModify: ''
    })
    const deleteData = id => {
      axios.delete('/api/link/?id=' + id).then(() => {
        data.value = []
        selectAll()
      })
    }
    const update = () => {
      axios.put('/api/link', editData).then(() => {
        data.value = []
        selectAll()
        editDialogVisible.value = false
      })
    }
    const edit = row => {
      editDialogVisible.value = true
      // console.log(row)
      editData.linkId = row.linkId
      editData.linkName = row.linkName
      editData.linkUrl = row.linkUrl
      editData.relateUnit = row.relateUnit
      editData.linkDesc = row.linkDesc
      editData.lastModify = row.lastModify
    }
    const submitData = () => {
      dialogFormVisible.value = false
      axios.post('/api/link', form).then(res => {
        console.log(res.data)
        data.value = []
        selectAll()
      })
    }
    const selectAll = () => {
      axios.get('/api/link').then(res => {
        const value = res.data.data
        value.forEach(item => {
          data.value.push(item)
        })
        console.log(data.value)
      })
    }
    onMounted(() => {
      selectAll()
    })
    return {
      dialogFormVisible,
      formLabelWidth,
      form,
      data,
      submitData,
      editDialogVisible,
      edit,
      editData,
      update,
      deleteData
    }
  }
}
</script>

<style scoped>
@import "../../assets/c/toefl.css";
@import "../../assets/c/base.css";
.el-select {
  width: 300px;
}
.el-input {
  width: 300px;
}
.el-dialog {
  width: 500px;
}
.dialog-footer button:first-child {
  margin-right: 10px;
}
</style>

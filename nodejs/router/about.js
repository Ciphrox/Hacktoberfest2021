const express = require('express')
const router = express.Router()

const aboutController = require('../controller/about')

router.get('/about', aboutController.getAbout)
router.post('/about', aboutController.PostAbout)

module.exports = router
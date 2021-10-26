const express = require('express')
const router = express.Router()

const contactController = require('../controller/contact')

router.get('/contact', contactController.getContact)
router.post('/contact', contactController.postContact)

module.exports = router
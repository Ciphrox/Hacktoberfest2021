const express = require('express')
const router = express.Router()

const helpController = require('../controller/help')

router.get('/help', helpController.getHelp)
router.post('/help', helpController.postHelp)

module.exports = router
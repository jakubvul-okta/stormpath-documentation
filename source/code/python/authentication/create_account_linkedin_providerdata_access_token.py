from stormpath.resources import Provider

account = application.accounts.create({
    'provider_data': {
        'provider_id': Provider.LINKEDIN,
        'access_token': 'xxx',
    }
})

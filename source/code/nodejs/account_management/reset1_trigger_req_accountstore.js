var passwordResetRequest = {
  email: 'phasma@empire.gov',
  accountStore: {
    href: 'https://api.stormpath.com/v1/groups/2SKhstu8Plaekcai8lghrp'
  }
};

application.sendPasswordResetEmail(passwordResetRequest, function (err) {
  if (err) {
    return console.error(err);
  }

  console.log('A reset password email has been sent!');
});
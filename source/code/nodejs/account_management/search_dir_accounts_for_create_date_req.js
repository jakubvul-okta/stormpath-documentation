var query = {
  modifiedAt: '2015-12-01'
};

directory.getAccounts(query, function (err, result) {
  if (err) {
    return console.error(err);
  }

  console.log('Found %s matching accounts in directory!', result.size);
});
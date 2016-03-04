.. _changelog:

**********
Change Log
**********

Stormpath is currently on Version 1 of its API, and all APIs use the ``/v1/`` namespace. All changes to the API and documentation are therefore arranged by date, in descending order.

.. todo::

    UNRELEASED

    *The following changes have been made to the documentation, but not yet published. When they are ready to be published, this section will be converted into a dated section like the ones below*

    - List of changes, with links
    - List item, with link to documentation if applicable
    - Fixed:
    - Modified:
    - New

    DATE YYYY-MM-DD

    - List of changes, with links
    - List item, with link to documentation if applicable
    - Fixed:
    - Modified:
    - New:

    Link to Tweet or blog post announcing changes (if applicable)

2016-03-01
==========

Information about new ``multipart/alternative`` email type added to Reference section on :ref:`Email Templates <ref-emailtemplates>` and Account Management section on :ref:`customizing email templates via REST <customizing-email-templates>`.

2016-02-24
==========

Added section on :ref:`how to route users to their tenant <multitenant-routing-users>`.

2016-02-19
==========

Multi-tenancy chapter significantly expanded. Now includes more information about :ref:`using Groups vs Directories to model tenants <multitenancy-strategies>`.

2016-02-16
==========

- Added information about :ref:`IdP-initiated SAML Authentication <saml-authn>`.
- Updated Application's :ref:`SAML Policy <ref-samlpolicy>` resource in Reference Chapter to include new ``defaultRelayStates`` endpoint.

2016-02-10
==========

Changed Sphinx Theme to `Read The Docs <http://docs.readthedocs.org/en/latest/theme.html>`_.

2016-02-02
==========

- Updated SAML Section of Authentication chapter to include :ref:`IdP-specific set-up guides <saml-configuration>`.
- Added missing :ref:`organizationAccountStoreMappings <ref-org-asm>` resource to Reference chapter.

2016-01-20
==========

- Added :ref:`Change Log <changelog>`.
- Directory type language changed. "Social", "Mirror" and "SAML" Directories are all actually "Mirror Directories", and the language in the :ref:`Account Management <account-mgmt>` and :ref:`Authentication <authn>` chapters has been updated to reflect this.
- Created top-level :ref:`Mirror Directories section <about-mirror-dir>` that discusses all Mirror Directories in general and how to support multiple Mirror Directories.
- Updated information about :ref:`Master Directories <mirror-login>` and how they function.
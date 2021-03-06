package io.fabric8.launcher.service.git;

import io.fabric8.launcher.base.EnvironmentEnum;

/**
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public enum GitEnvironment implements EnvironmentEnum {
    // TODO: Rename this to LAUNCHER_GIT_REPOSITORY_DESCRIPTION
    LAUNCHER_BACKEND_GIT_REPOSITORY_DESCRIPTION,
    LAUNCHER_GIT_PROVIDER,
    LAUNCHER_GIT_COMMITTER_AUTHOR,
    LAUNCHER_GIT_COMMITTER_AUTHOR_EMAIL
}

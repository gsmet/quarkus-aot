package fr.spacefox.perftests.quarkus.core.service384;

import fr.spacefox.perftests.quarkus.core.port.data.Entity384DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service384.model.Model384;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service384 {

    private final Entity384DatasourcePort datasource;

    public Service384(Entity384DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model384 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

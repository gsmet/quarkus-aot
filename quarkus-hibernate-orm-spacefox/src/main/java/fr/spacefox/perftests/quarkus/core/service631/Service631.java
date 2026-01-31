package fr.spacefox.perftests.quarkus.core.service631;

import fr.spacefox.perftests.quarkus.core.port.data.Entity631DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service631.model.Model631;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service631 {

    private final Entity631DatasourcePort datasource;

    public Service631(Entity631DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model631 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

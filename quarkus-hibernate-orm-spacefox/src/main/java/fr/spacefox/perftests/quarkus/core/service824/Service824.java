package fr.spacefox.perftests.quarkus.core.service824;

import fr.spacefox.perftests.quarkus.core.port.data.Entity824DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service824.model.Model824;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service824 {

    private final Entity824DatasourcePort datasource;

    public Service824(Entity824DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model824 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

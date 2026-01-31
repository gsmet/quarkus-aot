package fr.spacefox.perftests.quarkus.core.service14;

import fr.spacefox.perftests.quarkus.core.port.data.Entity14DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service14.model.Model14;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service14 {

    private final Entity14DatasourcePort datasource;

    public Service14(Entity14DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model14 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

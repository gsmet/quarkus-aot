package fr.spacefox.perftests.quarkus.core.service337;

import fr.spacefox.perftests.quarkus.core.port.data.Entity337DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service337.model.Model337;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service337 {

    private final Entity337DatasourcePort datasource;

    public Service337(Entity337DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model337 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

package fr.spacefox.perftests.quarkus.core.service570;

import fr.spacefox.perftests.quarkus.core.port.data.Entity570DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service570.model.Model570;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service570 {

    private final Entity570DatasourcePort datasource;

    public Service570(Entity570DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model570 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

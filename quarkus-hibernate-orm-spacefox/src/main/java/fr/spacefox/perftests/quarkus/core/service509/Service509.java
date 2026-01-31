package fr.spacefox.perftests.quarkus.core.service509;

import fr.spacefox.perftests.quarkus.core.port.data.Entity509DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service509.model.Model509;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service509 {

    private final Entity509DatasourcePort datasource;

    public Service509(Entity509DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model509 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

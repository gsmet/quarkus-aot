package fr.spacefox.perftests.quarkus.core.service333;

import fr.spacefox.perftests.quarkus.core.port.data.Entity333DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service333.model.Model333;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service333 {

    private final Entity333DatasourcePort datasource;

    public Service333(Entity333DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model333 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

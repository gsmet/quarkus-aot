package fr.spacefox.perftests.quarkus.core.service454;

import fr.spacefox.perftests.quarkus.core.port.data.Entity454DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service454.model.Model454;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service454 {

    private final Entity454DatasourcePort datasource;

    public Service454(Entity454DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model454 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

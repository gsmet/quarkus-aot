package fr.spacefox.perftests.quarkus.core.service237;

import fr.spacefox.perftests.quarkus.core.port.data.Entity237DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service237.model.Model237;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service237 {

    private final Entity237DatasourcePort datasource;

    public Service237(Entity237DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model237 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

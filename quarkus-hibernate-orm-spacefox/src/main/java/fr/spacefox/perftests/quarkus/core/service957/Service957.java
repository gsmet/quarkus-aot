package fr.spacefox.perftests.quarkus.core.service957;

import fr.spacefox.perftests.quarkus.core.port.data.Entity957DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service957.model.Model957;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service957 {

    private final Entity957DatasourcePort datasource;

    public Service957(Entity957DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model957 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

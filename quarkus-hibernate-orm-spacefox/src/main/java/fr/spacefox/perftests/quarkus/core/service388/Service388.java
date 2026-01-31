package fr.spacefox.perftests.quarkus.core.service388;

import fr.spacefox.perftests.quarkus.core.port.data.Entity388DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service388.model.Model388;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service388 {

    private final Entity388DatasourcePort datasource;

    public Service388(Entity388DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model388 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

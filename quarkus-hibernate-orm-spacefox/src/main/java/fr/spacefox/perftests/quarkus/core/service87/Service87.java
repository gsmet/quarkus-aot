package fr.spacefox.perftests.quarkus.core.service87;

import fr.spacefox.perftests.quarkus.core.port.data.Entity87DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service87.model.Model87;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service87 {

    private final Entity87DatasourcePort datasource;

    public Service87(Entity87DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model87 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

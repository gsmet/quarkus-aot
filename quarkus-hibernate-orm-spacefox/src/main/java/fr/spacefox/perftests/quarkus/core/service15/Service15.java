package fr.spacefox.perftests.quarkus.core.service15;

import fr.spacefox.perftests.quarkus.core.port.data.Entity15DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service15.model.Model15;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service15 {

    private final Entity15DatasourcePort datasource;

    public Service15(Entity15DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model15 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

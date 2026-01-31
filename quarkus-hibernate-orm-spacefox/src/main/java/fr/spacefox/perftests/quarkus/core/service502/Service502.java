package fr.spacefox.perftests.quarkus.core.service502;

import fr.spacefox.perftests.quarkus.core.port.data.Entity502DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service502.model.Model502;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service502 {

    private final Entity502DatasourcePort datasource;

    public Service502(Entity502DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model502 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

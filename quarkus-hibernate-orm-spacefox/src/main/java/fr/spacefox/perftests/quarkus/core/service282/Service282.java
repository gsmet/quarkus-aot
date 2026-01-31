package fr.spacefox.perftests.quarkus.core.service282;

import fr.spacefox.perftests.quarkus.core.port.data.Entity282DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service282.model.Model282;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service282 {

    private final Entity282DatasourcePort datasource;

    public Service282(Entity282DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model282 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

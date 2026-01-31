package fr.spacefox.perftests.quarkus.core.service335;

import fr.spacefox.perftests.quarkus.core.port.data.Entity335DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service335.model.Model335;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service335 {

    private final Entity335DatasourcePort datasource;

    public Service335(Entity335DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model335 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

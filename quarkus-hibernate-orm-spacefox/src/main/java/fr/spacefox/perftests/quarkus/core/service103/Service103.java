package fr.spacefox.perftests.quarkus.core.service103;

import fr.spacefox.perftests.quarkus.core.port.data.Entity103DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service103.model.Model103;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service103 {

    private final Entity103DatasourcePort datasource;

    public Service103(Entity103DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model103 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

package fr.spacefox.perftests.quarkus.core.service143;

import fr.spacefox.perftests.quarkus.core.port.data.Entity143DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service143.model.Model143;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service143 {

    private final Entity143DatasourcePort datasource;

    public Service143(Entity143DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model143 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

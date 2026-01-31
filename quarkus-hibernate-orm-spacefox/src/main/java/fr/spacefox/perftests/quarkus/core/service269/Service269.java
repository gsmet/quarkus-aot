package fr.spacefox.perftests.quarkus.core.service269;

import fr.spacefox.perftests.quarkus.core.port.data.Entity269DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service269.model.Model269;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service269 {

    private final Entity269DatasourcePort datasource;

    public Service269(Entity269DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model269 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

package fr.spacefox.perftests.quarkus.core.service965;

import fr.spacefox.perftests.quarkus.core.port.data.Entity965DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service965.model.Model965;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service965 {

    private final Entity965DatasourcePort datasource;

    public Service965(Entity965DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model965 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

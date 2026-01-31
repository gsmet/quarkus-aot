package fr.spacefox.perftests.quarkus.core.service221;

import fr.spacefox.perftests.quarkus.core.port.data.Entity221DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service221.model.Model221;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service221 {

    private final Entity221DatasourcePort datasource;

    public Service221(Entity221DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model221 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

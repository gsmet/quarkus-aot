package fr.spacefox.perftests.quarkus.core.service83;

import fr.spacefox.perftests.quarkus.core.port.data.Entity83DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service83.model.Model83;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service83 {

    private final Entity83DatasourcePort datasource;

    public Service83(Entity83DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model83 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

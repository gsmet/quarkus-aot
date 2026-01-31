package fr.spacefox.perftests.quarkus.core.service257;

import fr.spacefox.perftests.quarkus.core.port.data.Entity257DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service257.model.Model257;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service257 {

    private final Entity257DatasourcePort datasource;

    public Service257(Entity257DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model257 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

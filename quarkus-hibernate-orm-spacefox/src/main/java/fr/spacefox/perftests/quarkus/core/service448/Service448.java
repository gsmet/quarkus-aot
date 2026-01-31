package fr.spacefox.perftests.quarkus.core.service448;

import fr.spacefox.perftests.quarkus.core.port.data.Entity448DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service448.model.Model448;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service448 {

    private final Entity448DatasourcePort datasource;

    public Service448(Entity448DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model448 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

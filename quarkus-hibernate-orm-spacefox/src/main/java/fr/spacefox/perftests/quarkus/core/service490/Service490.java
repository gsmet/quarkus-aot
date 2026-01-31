package fr.spacefox.perftests.quarkus.core.service490;

import fr.spacefox.perftests.quarkus.core.port.data.Entity490DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service490.model.Model490;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service490 {

    private final Entity490DatasourcePort datasource;

    public Service490(Entity490DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model490 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

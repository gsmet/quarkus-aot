package fr.spacefox.perftests.quarkus.core.service438;

import fr.spacefox.perftests.quarkus.core.port.data.Entity438DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service438.model.Model438;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service438 {

    private final Entity438DatasourcePort datasource;

    public Service438(Entity438DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model438 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

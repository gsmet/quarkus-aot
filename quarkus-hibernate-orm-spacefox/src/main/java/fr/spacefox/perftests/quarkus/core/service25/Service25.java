package fr.spacefox.perftests.quarkus.core.service25;

import fr.spacefox.perftests.quarkus.core.port.data.Entity25DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service25.model.Model25;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service25 {

    private final Entity25DatasourcePort datasource;

    public Service25(Entity25DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model25 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

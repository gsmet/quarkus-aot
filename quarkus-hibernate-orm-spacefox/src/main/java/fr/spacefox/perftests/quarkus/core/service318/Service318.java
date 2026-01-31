package fr.spacefox.perftests.quarkus.core.service318;

import fr.spacefox.perftests.quarkus.core.port.data.Entity318DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service318.model.Model318;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service318 {

    private final Entity318DatasourcePort datasource;

    public Service318(Entity318DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model318 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

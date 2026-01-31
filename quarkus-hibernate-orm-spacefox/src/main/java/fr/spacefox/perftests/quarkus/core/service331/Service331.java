package fr.spacefox.perftests.quarkus.core.service331;

import fr.spacefox.perftests.quarkus.core.port.data.Entity331DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service331.model.Model331;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service331 {

    private final Entity331DatasourcePort datasource;

    public Service331(Entity331DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model331 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

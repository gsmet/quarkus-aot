package fr.spacefox.perftests.quarkus.core.service549;

import fr.spacefox.perftests.quarkus.core.port.data.Entity549DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service549.model.Model549;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service549 {

    private final Entity549DatasourcePort datasource;

    public Service549(Entity549DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model549 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

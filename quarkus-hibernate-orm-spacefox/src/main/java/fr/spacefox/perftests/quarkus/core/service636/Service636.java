package fr.spacefox.perftests.quarkus.core.service636;

import fr.spacefox.perftests.quarkus.core.port.data.Entity636DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service636.model.Model636;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service636 {

    private final Entity636DatasourcePort datasource;

    public Service636(Entity636DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model636 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

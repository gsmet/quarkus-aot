package fr.spacefox.perftests.quarkus.core.service733;

import fr.spacefox.perftests.quarkus.core.port.data.Entity733DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service733.model.Model733;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service733 {

    private final Entity733DatasourcePort datasource;

    public Service733(Entity733DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model733 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

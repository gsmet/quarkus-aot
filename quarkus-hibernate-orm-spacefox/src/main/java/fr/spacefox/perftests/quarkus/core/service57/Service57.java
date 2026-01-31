package fr.spacefox.perftests.quarkus.core.service57;

import fr.spacefox.perftests.quarkus.core.port.data.Entity57DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service57.model.Model57;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service57 {

    private final Entity57DatasourcePort datasource;

    public Service57(Entity57DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model57 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

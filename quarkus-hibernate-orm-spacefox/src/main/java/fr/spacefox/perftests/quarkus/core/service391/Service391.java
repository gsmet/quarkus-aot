package fr.spacefox.perftests.quarkus.core.service391;

import fr.spacefox.perftests.quarkus.core.port.data.Entity391DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service391.model.Model391;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service391 {

    private final Entity391DatasourcePort datasource;

    public Service391(Entity391DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model391 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

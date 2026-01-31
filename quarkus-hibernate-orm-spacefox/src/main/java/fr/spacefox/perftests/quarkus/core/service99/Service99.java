package fr.spacefox.perftests.quarkus.core.service99;

import fr.spacefox.perftests.quarkus.core.port.data.Entity99DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service99.model.Model99;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service99 {

    private final Entity99DatasourcePort datasource;

    public Service99(Entity99DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model99 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

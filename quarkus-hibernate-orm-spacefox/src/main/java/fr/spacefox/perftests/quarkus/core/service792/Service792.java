package fr.spacefox.perftests.quarkus.core.service792;

import fr.spacefox.perftests.quarkus.core.port.data.Entity792DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service792.model.Model792;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service792 {

    private final Entity792DatasourcePort datasource;

    public Service792(Entity792DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model792 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

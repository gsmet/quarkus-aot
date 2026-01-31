package fr.spacefox.perftests.quarkus.core.service105;

import fr.spacefox.perftests.quarkus.core.port.data.Entity105DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service105.model.Model105;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service105 {

    private final Entity105DatasourcePort datasource;

    public Service105(Entity105DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model105 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

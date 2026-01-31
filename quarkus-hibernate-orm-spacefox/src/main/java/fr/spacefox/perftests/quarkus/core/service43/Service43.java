package fr.spacefox.perftests.quarkus.core.service43;

import fr.spacefox.perftests.quarkus.core.port.data.Entity43DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service43.model.Model43;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service43 {

    private final Entity43DatasourcePort datasource;

    public Service43(Entity43DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model43 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

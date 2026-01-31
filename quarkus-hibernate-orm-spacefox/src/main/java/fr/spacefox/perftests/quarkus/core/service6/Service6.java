package fr.spacefox.perftests.quarkus.core.service6;

import fr.spacefox.perftests.quarkus.core.port.data.Entity6DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service6.model.Model6;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service6 {

    private final Entity6DatasourcePort datasource;

    public Service6(Entity6DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model6 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

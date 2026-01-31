package fr.spacefox.perftests.quarkus.core.service569;

import fr.spacefox.perftests.quarkus.core.port.data.Entity569DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service569.model.Model569;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service569 {

    private final Entity569DatasourcePort datasource;

    public Service569(Entity569DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model569 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

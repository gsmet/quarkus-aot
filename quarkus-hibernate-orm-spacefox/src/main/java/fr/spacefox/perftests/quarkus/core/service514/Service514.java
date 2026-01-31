package fr.spacefox.perftests.quarkus.core.service514;

import fr.spacefox.perftests.quarkus.core.port.data.Entity514DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service514.model.Model514;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service514 {

    private final Entity514DatasourcePort datasource;

    public Service514(Entity514DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model514 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

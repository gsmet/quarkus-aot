package fr.spacefox.perftests.quarkus.core.service543;

import fr.spacefox.perftests.quarkus.core.port.data.Entity543DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service543.model.Model543;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service543 {

    private final Entity543DatasourcePort datasource;

    public Service543(Entity543DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model543 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

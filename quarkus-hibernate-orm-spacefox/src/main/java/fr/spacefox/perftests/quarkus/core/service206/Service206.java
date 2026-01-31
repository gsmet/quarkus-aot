package fr.spacefox.perftests.quarkus.core.service206;

import fr.spacefox.perftests.quarkus.core.port.data.Entity206DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service206.model.Model206;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service206 {

    private final Entity206DatasourcePort datasource;

    public Service206(Entity206DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model206 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

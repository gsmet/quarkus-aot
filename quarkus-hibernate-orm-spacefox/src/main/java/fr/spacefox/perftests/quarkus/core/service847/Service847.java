package fr.spacefox.perftests.quarkus.core.service847;

import fr.spacefox.perftests.quarkus.core.port.data.Entity847DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service847.model.Model847;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service847 {

    private final Entity847DatasourcePort datasource;

    public Service847(Entity847DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model847 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}

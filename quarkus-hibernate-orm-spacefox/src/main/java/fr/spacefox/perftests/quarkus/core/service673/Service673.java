package fr.spacefox.perftests.quarkus.core.service673;

import fr.spacefox.perftests.quarkus.core.port.data.Entity673DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service673.model.Model673;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service673 {

    private final Entity673DatasourcePort datasource;

    public Service673(Entity673DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model673 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
